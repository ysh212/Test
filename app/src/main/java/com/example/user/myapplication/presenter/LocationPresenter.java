package com.example.user.myapplication.presenter;

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


import com.example.user.myapplication.interactor.ILocationInteractor;
import com.example.user.myapplication.interactor.LocationInteractor;
import com.example.user.myapplication.view.ILocationView;
import com.skp.Tmap.TMapView;

/**
 * 여기서 TMAP이나 그냥 지도를 사용해야 할것 같습니다.
 *
 */
public class LocationPresenter implements ILocationPresenter, ILocationInteractor.checkedBtnListener{

    ILocationView locationView;
    ILocationInteractor locationInteractor;


    public LocationPresenter(ILocationView locationView){
        this.locationView = locationView;
        locationInteractor = new LocationInteractor();

    }


    @Override
    public void loadMap(TMapView tMapView) {
        /*
        인터렉터를 부르세요
         */

    }

    @Override
    public void sendToServer() {

    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onFailure(String message) {
        locationView.showAlert(message);
    }
}
