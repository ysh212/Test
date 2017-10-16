package com.example.user.myapplication.interactor;

import com.skp.Tmap.TMapView;

/**
 * Created by USER on 2017-10-16.
 */

public interface ILocationInteractor {
    interface checkedBtnListener{

        //이벤트 성공시
        void onSuccess();
        //이벤트 실패시
        void onFailure(String message);

    }

    void checkEvent(String radioMsg, checkedBtnListener listener);

}
