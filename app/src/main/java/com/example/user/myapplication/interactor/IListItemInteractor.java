package com.example.user.myapplication.interactor;

import com.example.user.myapplication.domain.Tourist;

/**
 * Created by USER on 2017-10-17.
 */

public interface IListItemInteractor {
    //커스텀리스트뷰에서 아이템이 선택되었을 때 발생하는 메소드 작성
    interface onSelectListener{
        void onSuccess();
    }

    void nextActivity(Tourist tourist, onSelectListener listener);

}
