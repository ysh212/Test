package com.example.user.myapplication.presenter;

import com.example.user.myapplication.domain.Tourist;
import com.example.user.myapplication.interactor.IListItemInteractor;
import com.example.user.myapplication.interactor.ListItemInteractor;
import com.example.user.myapplication.view.IListItemView;

/**
 * Created by USER on 2017-10-17.
 */

public class ListItemPresenter implements IListItemPresenter, IListItemInteractor.onSelectListener {
    IListItemView listItemView;
    IListItemInteractor listItemInteractor;


    public ListItemPresenter(IListItemView listItemView){
        this.listItemView = listItemView;
        listItemInteractor = new ListItemInteractor();
    }

    @Override
    public void selectedItem(Tourist tourist) {
        listItemInteractor.nextActivity(tourist, this);
    }

    @Override
    public void onSuccess() {
        if (listItemView != null){
            listItemView.navigateToDetail();
        }
    }
}
