package com.example.user.myapplication.interactor;

import com.example.user.myapplication.domain.Tourist;

/**
 * Created by USER on 2017-10-17.
 */

public class ListItemInteractor implements IListItemInteractor{
    @Override
    public void nextActivity(Tourist tourist, onSelectListener listener) {
        //아이템이 체크 되었다면( >0 ), listener.onSuccess() 메소드 실행
        if (tourist != null){
            listener.onSuccess();
        }
    }
}
