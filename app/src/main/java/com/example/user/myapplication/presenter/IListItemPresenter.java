package com.example.user.myapplication.presenter;


import com.example.user.myapplication.domain.Tourist;

/**
 * Created by USER on 2017-10-17.
 */

public interface IListItemPresenter {

    //View에서 선택된 아이템의 위치를 나타냄
    void selectedItem(Tourist tourist);

}
