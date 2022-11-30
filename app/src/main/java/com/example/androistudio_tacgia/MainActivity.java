package com.example.androistudio_tacgia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TacGiaAdapter tacGiaAdapter;
    private List<TacGia> list;

    public MainActivity(){
        list = new ArrayList<>();


        list.add(new TacGia("Huy Cận", R.drawable.huycan,"De Men Phieu Luu Ki", "Tô Hoài (tên khai sinh: Nguyễn Sen; 27 tháng 9 năm 1920 – 6 tháng 7 năm 2014)[1] là một nhà văn Việt Nam. "));
        list.add(new TacGia("Nam Cao", R.drawable.huycan,"De Men Phieu Luu Ki", "Tô Hoài (tên khai sinh: Nguyễn Sen; 27 tháng 9 năm 1920 – 6 tháng 7 năm 2014)[1] là một nhà văn Việt Nam. "));
        list.add(new TacGia("Hemingway", R.drawable.chakespeare,"De Men Phieu Luu Ki", "Tô Hoài (tên khai sinh: Nguyễn Sen; 27 tháng 9 năm 1920 – 6 tháng 7 năm 2014)[1] là một nhà văn Việt Nam. "));
        list.add(new TacGia("Shakespeare", R.drawable.chakespeare,"De Men Phieu Luu Ki", "Tô Hoài (tên khai sinh: Nguyễn Sen; 27 tháng 9 năm 1920 – 6 tháng 7 năm 2014)[1] là một nhà văn Việt Nam. "));
        list.add(new TacGia("Tố Hữu", R.drawable.chakespeare,"Dat No Hoa", "Cù Huy Cận (1919 – 2005), bút danh hoạt động nghệ thuật là Huy Cận, là một chính khách, từng giữ nhiều chức vụ lãnh đạo cao cấp trong chính phủ Việt Nam như Bộ trưởng Bộ Canh nông (nay là Bộ Nông nghiệp và Phát triển nông thôn), Thứ trưởng Bộ Văn hóa Nghệ thuật, Bộ trưởng Bộ Văn hóa Giáo dục,"));
        list.add(new TacGia("Mặc Ngôn", R.drawable.huycan,"Dat No Hoa", "Cù Huy Cận (1919 – 2005), bút danh hoạt động nghệ thuật là Huy Cận, là một chính khách, từng giữ nhiều chức vụ lãnh đạo cao cấp trong chính phủ Việt Nam như Bộ trưởng Bộ Canh nông (nay là Bộ Nông nghiệp và Phát triển nông thôn), Thứ trưởng Bộ Văn hóa Nghệ thuật, Bộ trưởng Bộ Văn hóa Giáo dục,"));


        tacGiaAdapter = new TacGiaAdapter(this, list);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = findViewById(R.id.lvTacGia);
        lv.setAdapter(tacGiaAdapter);
    }
}