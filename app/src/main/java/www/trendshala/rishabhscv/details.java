package www.trendshala.rishabhscv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class details extends AppCompatActivity {


    TextView courses,skills,projects;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        courses = findViewById(R.id.courses);
        projects = findViewById(R.id.projects);
        skills = findViewById(R.id.skills);

        courses.setText(
                "Coursera/ By CentraleSupèlec\nGreat Learning (Online)\neduCBA (Online)\n");
        projects.setText(
                        "1) Tic Tac Toe game\nan activity,With great Ui/logics\n"+"\n"+"2) Food donation app\nAuthentication-firebase, Having to profile donor and receiver, Having multi activities, Fragments!");
        skills.setText(
                "Java, C/C++ Programming,Python, Data Structures");
    }
}