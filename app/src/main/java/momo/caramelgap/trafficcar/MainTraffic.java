package momo.caramelgap.trafficcar;

import android.media.MediaPlayer;
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
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.effect_btn_shut);
                mediaPlayer.start();

                //Intent to WebView https://youtu.be/Dvgb8nxi9To

            }   // onclick
        });



    }   //Main Method
}   //Main class
