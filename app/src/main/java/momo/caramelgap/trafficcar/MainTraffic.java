package momo.caramelgap.trafficcar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import static momo.caramelgap.trafficcar.R.id.button;

public class MainTraffic extends AppCompatActivity {

    // Explicit การประกาศตัวแปร
    private ListView trafficListView;
    private Button abountMeButton;
    private static final String urlYouTube = "https://youtu.be/Tf-hD_DFeyU";
    //static  ค่าคงที่  final เปลี่ยนแปลงไม่ได้  String =Object Java

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // This's Statement
        setContentView(R.layout.activity_main_traffic);

        //Bind Widget ผูกความสัมพันธ์กับตัวแปร และ Widget
        trafficListView = (ListView) findViewById(R.id.listView);

        // เป็นตัวแดง Alt+Enter (Button) fi  เลือกอันแรก พวกรูปภาพ เสียง
        //Ctrl+Shift+Enter = ปิดท้าย
        abountMeButton = (Button) findViewById(R.id.button);

        //Get Event from Click Button'
        abountMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //ใส่เสียง mp3 wav ชื่อพิมเล็กเท่านั้น Sound Effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_long);
                mediaPlayer.start();

                //Intent to WebView https://youtu.be/Tf-hD_DFeyU
                //Intent = ประกาศ class I ใหญ่ intent = new Intent(Intent.ACV
                Intent intent = new Intent(Intent.ACTION_VIEW);
                // Uri คือเรียกใช้
                intent.setData(Uri.parse(urlYouTube));
                startActivity(intent);

            }   // onclick
        });

        //Create ListView
        //1. Setup Basic Array กำหนดบน class ประกาศตัวแปรใช้เฉพาะ method นี้เท่านั้น

        int[] iconInts = new int[20];
        // ค่ารูปแรก  C+A+L  รหัสเรียงบรรทัด
        iconInts[0] = R.drawable.traffic_01;
        iconInts[1] = R.drawable.traffic_02;
        iconInts[2] = R.drawable.traffic_03;
        iconInts[3] = R.drawable.traffic_04;
        iconInts[4] = R.drawable.traffic_05;
        iconInts[5] = R.drawable.traffic_06;
        iconInts[6] = R.drawable.traffic_07;
        iconInts[7] = R.drawable.traffic_08;
        iconInts[8] = R.drawable.traffic_09;
        iconInts[9] = R.drawable.traffic_10;
        iconInts[10] = R.drawable.traffic_11;
        iconInts[11] = R.drawable.traffic_12;
        iconInts[12] = R.drawable.traffic_13;
        iconInts[13] = R.drawable.traffic_14;
        iconInts[14] = R.drawable.traffic_15;
        iconInts[15] = R.drawable.traffic_16;
        iconInts[16] = R.drawable.traffic_17;
        iconInts[17] = R.drawable.traffic_18;
        iconInts[18] = R.drawable.traffic_19;
        iconInts[19] = R.drawable.traffic_20;

        //2. Setup Array from other class (MyData 15)  ดึง data จาก pate
        MyData myData = new MyData();
        String[] titleStrings = myData.getTiteStrings();

        int[] ints = myData.getInts();
        String[] StockStrings = new String[ints.length];
        String[] priceStrings = new String[ints.length];

        for (int i=0;i<ints.length;i+=1) {

            StockStrings[i] = "Stock =" + Integer.toString(ints[i]);
            priceStrings[i] = Integer.toString(ints[i]) + "บาท";

        }


        // 3. Setup Array form other xml (my_data.xml)
        String[] detailStrings = getResources().getStringArray(R.array.detail);

        //SubString คือการตัดคำ
        //ต้อวการจองหน่วยความจำ นับเอง
        String[] detailShortStrings = new String[detailStrings.length];
        for (int i=0; i<detailStrings.length; i+=1) {

            detailShortStrings[i] = detailStrings[i].substring(0, 30) + "...";

        }   // for

        //สือทอด

        TrafficAdapter trafficAdapter = new TrafficAdapter(this, iconInts, titleStrings, detailShortStrings, StockStrings, priceStrings);
        trafficListView.setAdapter(trafficAdapter);


    }   //Main Method
}   //Main class
