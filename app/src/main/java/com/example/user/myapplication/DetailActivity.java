package com.example.user.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.myapplication.presenter.DetailPresenter;
import com.example.user.myapplication.presenter.IDetailPresenter;
import com.example.user.myapplication.view.IDetailView;
import com.skp.Tmap.TMapView;


/**
 * Created by USER on 2017-10-16.
 */

public class DetailActivity extends AppCompatActivity implements IDetailView{

    private Button checkBtn, cancelBtn;
    TextView detailContents;
    TMapView tMapView;

    private IDetailPresenter detailPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //확인 버튼
        checkBtn = (Button) findViewById(R.id.checkBtn);
        //취소 버튼
        cancelBtn = (Button) findViewById(R.id.cancelBtn);
        //ListItem 목록에서 선택된 항목에 대한 상세정보를 출력
        detailContents = (TextView) findViewById(R.id.detailContents);

        tMapView = (TMapView) findViewById(R.id.tMap);

        detailPresenter = new DetailPresenter(this);
        detailPresenter.loadMap(tMapView);

        //확인 버튼 누르면 서버로 데이터 전송
        checkBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });

        //취소 버튼 누르면 이전 페이지로 이동
        cancelBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
    }


    @Override
    public void detailContents(String detailMsg) {

    }

    @Override
    public void loadMap() {

    }

    @Override
    public void addTourist() {

    }

    @Override
    public void removeTourist() {

    }
}
