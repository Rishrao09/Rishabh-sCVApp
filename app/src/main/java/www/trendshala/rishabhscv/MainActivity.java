package www.trendshala.rishabhscv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t = findViewById(R.id.education);
        Button educationBtn = findViewById(R.id.educationBtn);
        Button next1 = findViewById(R.id.next1);


        educationBtn.setOnClickListener(v -> {
            t.setText("Bachelor of Technology (B.Tech)\nComputer Science(2018-2022)\nLDRP Institute Technology and Research\n8.70/10\n" +
                    "\n" +
                    "XII (Senior Secondary), Science - 2017\nGUJARAT BOARD Board (Adarsh Maha Vidyalaya)\n67%");
            next1.setVisibility(View.VISIBLE);

        });
        next1.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,details.class)));

    }
}