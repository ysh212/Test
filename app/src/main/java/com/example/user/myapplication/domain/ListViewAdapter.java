package com.example.user.myapplication.domain;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.myapplication.R;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by USER on 2017-10-16.
 */

public class ListViewAdapter extends BaseAdapter {
    // Adapter에 추가된 데이터를 저장하기 위한 ArrayList
    private ArrayList<ListItem> listItemList = new ArrayList<ListItem>() ;

    // ListViewAdapter의 생성자
    public ListViewAdapter() {

    }

    // Adapter에 사용되는 데이터의 개수를 리턴. : 필수 구현
    @Override
    public int getCount() {
        return listItemList.size();
    }

    // 지정한 위치(position)에 있는 데이터 리턴 : 필수 구현
    @Override
    public Object getItem(int position) {
        return listItemList.get(position);
    }

    // 지정한 위치(position)에 있는 데이터와 관계된 아이템(row)의 ID를 리턴. : 필수 구현
    @Override
    public long getItemId(int position) {
        return position;
    }

    // position에 위치한 데이터를 화면에 출력하는데 사용될 View를 리턴. : 필수 구현
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        // "listview_item" Layout을 inflate하여 convertView 참조 획득.
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_item, parent, false);
        }

        // 화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        TextView locationTextView = (TextView) convertView.findViewById(R.id.textView1) ;
        TextView distanceView = (TextView) convertView.findViewById(R.id.textView2) ;
        TextView requestTimeView = (TextView) convertView.findViewById(R.id.textView3) ;
        TextView langTextView = (TextView) convertView.findViewById(R.id.textView4) ;

        // Data Set(listItemList)에서 position에 위치한 데이터 참조 획득
        ListItem listItem = listItemList.get(position);

        // 아이템 내 각 위젯에 데이터 반영
        locationTextView.setText(listItem.getLocation());
        distanceView.setText(listItem.getDistance());
        requestTimeView.setText((CharSequence) listItem.getRequestTime());
        langTextView.setText((CharSequence) listItem.getLang());

        return convertView;
   }

    // 아이템 데이터 추가를 위한 함수. 개발자가 원하는대로 작성 가능.
    public void addItem(String location, String distance, Date requestTime, List<String> lang) {
        ListItem item = new ListItem();

        item.setLocation(location);
        item.setDistance(distance);
        item.setRequestTime(requestTime);
        item.setLang(lang);

        listItemList.add(item);
    }
}
