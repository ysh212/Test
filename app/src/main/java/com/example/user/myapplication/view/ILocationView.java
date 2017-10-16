package com.example.user.myapplication.view;

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

public interface ILocationView {

    //새로고침 버튼 클릭시 LocationActivity 초기화
    void showRe();

    //아무것도 선택 안하고 확인 버튼 눌렀을 때의 경고알림
    void showAlert(String message);

    public void loadMap();

    public void addTourist();

    public void removeTourist();

}
