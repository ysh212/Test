package com.example.user.myapplication;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TableRow;
import android.widget.Toast;

import com.example.user.myapplication.presenter.ILocationPresenter;
import com.example.user.myapplication.presenter.LocationPresenter;
import com.example.user.myapplication.view.ILocationView;
import com.skp.Tmap.TMapPoint;
import com.skp.Tmap.TMapView;

/** by Hong Ji Hoon aka Hongvyo on github,
 *  Kim Eun Hye,
 *  Kim Min Ji,
 *  Kwon Soon Jo,
 *  Yu Seok Hwan
 *
 * 2017 september
 * submission to the Seoul App Competition held by the Seoul City Government.
 * copyright: MIT License
 */

public class LocationActivity extends AppCompatActivity implements ILocationView {
    private Button newBtn, checkBtn;
    CheckBox checkBox1, checkBox2, checkBox3;

    private ILocationPresenter locationPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        //새로고침
        newBtn = (Button) findViewById(R.id.newBtn);
        //확인
        checkBtn = (Button) findViewById(R.id.checkBtn);

        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);

        locationPresenter = new LocationPresenter(this);

        newBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        checkBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });

    }

    @Override
    public void showRe() {

    }

    @Override
    public void showAlert(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
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
