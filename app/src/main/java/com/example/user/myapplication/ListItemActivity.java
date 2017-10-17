package com.example.user.myapplication;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.user.myapplication.domain.ListViewAdapter;
import com.example.user.myapplication.domain.Tourist;
import com.example.user.myapplication.presenter.ListItemPresenter;
import com.example.user.myapplication.view.IListItemView;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by USER on 2017-10-17.
 */

public class ListItemActivity extends AppCompatActivity implements IListItemView{

    private ListItemPresenter listItemPresenter;
    //리스트뷰 레이아웃
    ListView listView;
    //어댑터 데이터
    ListViewAdapter listViewAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        //View를 먼저 설정해야 돼...(커스텀리스트뷰)
        setupView();

        listItemPresenter = new ListItemPresenter(this);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Tourist item = (Tourist) parent.getItemAtPosition(position);

                /*
                String location = item.getLocation();
                String distance = item.getDistance();
                String language = item.getLang();
                Date requestTime = item.getRequestTime();

                //클릭된 이벤트를 Toast로 보여주기 - 제대로 작동하는지 확인용일 뿐
                Toast.makeText(ListItemActivity.this, location, Toast.LENGTH_SHORT).show();
                */

                //클릭된 아이템
                listItemPresenter.selectedItem(item);
            }
        });
    }

    @Override
    public void navigateToDetail() {
        startActivity(new Intent(ListItemActivity.this, DetailActivity.class));
    }

    private void setupView(){
        //어댑터 객체 생성
        listViewAdapter = new ListViewAdapter();
        listView = (ListView) findViewById(R.id.listview1);

        //목록에 아이템 채우기 - 서버에서 온 데이터를 목록에 표현하면 될듯
        //샘플 데이터
        listViewAdapter.addItem("수원", "20km", "English");
        listViewAdapter.addItem("서울", "34km", "Chinese");
        listViewAdapter.addItem("인천", "11km", "Aguagu");
        listViewAdapter.addItem("대구", "210km", "Troll");
        listViewAdapter.addItem("부산", "323km", "Stupid");
        listViewAdapter.addItem("대전", "154km", "melong");

        listView.setAdapter(listViewAdapter);
    }

    /*
    //위도, 경도 좌표를 이용해서 주소값 리턴
    private String findAddress(Double lat, Double lon){
        String nowAddress = null;
        Geocoder geocoder = new Geocoder(this, Locale.KOREA);
        List<Address> address = null;
        try{
            if(geocoder != null){
                //세번째 인수는 최대결과값 - 하나만 리턴받도록 설정
                address = geocoder.getFromLocation(lat, lon, 1);
            }
            //설정한 데이터로 주소가 리턴된 데이터가 있으면...
            if(address != null && address.size()>0){
                //주소
                String currentLocationAddress = address.get(0).getAddressLine(0).toString();
                nowAddress = currentLocationAddress;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return nowAddress;
    }
    */
}


