package com.example.androistudio_tacgia;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class TacPhamActivity extends AppCompatActivity{
    TextView tvName, back, tvInfo;
    ImageView imageViewAuthor;
    private TacPhamAdapter tacPhamAdapter;
    private List<TacPham> list;

    public TacPhamActivity() {
        list = new ArrayList<>();

        list.add(new TacPham("Tràng giang", R.drawable.tranggiang, "Tràng giang là một trong những bài thơ hay nhất, tiêu biểu nhất của Huy Cận. Theo tác giả, bài thơ này được viết vào mùa thu năm 1939 (in trong tập Lửa thiêng) và cảm xúc được khơi gợi chủ yếu từ cảnh sông Hồng mênh mang sóng nước"));
        list.add(new TacPham("Tràng giang", R.drawable.tranggiang, "Tràng giang là một trong những bài thơ hay nhất, tiêu biểu nhất của Huy Cận. Theo tác giả, bài thơ này được viết vào mùa thu năm 1939 (in trong tập Lửa thiêng) và cảm xúc được khơi gợi chủ yếu từ cảnh sông Hồng mênh mang sóng nước"));
        list.add(new TacPham("Tràng giang", R.drawable.tranggiang, "Tràng giang là một trong những bài thơ hay nhất, tiêu biểu nhất của Huy Cận. Theo tác giả, bài thơ này được viết vào mùa thu năm 1939 (in trong tập Lửa thiêng) và cảm xúc được khơi gợi chủ yếu từ cảnh sông Hồng mênh mang sóng nước"));
        list.add(new TacPham("Tràng giang", R.drawable.tranggiang, "Tràng giang là một trong những bài thơ hay nhất, tiêu biểu nhất của Huy Cận. Theo tác giả, bài thơ này được viết vào mùa thu năm 1939 (in trong tập Lửa thiêng) và cảm xúc được khơi gợi chủ yếu từ cảnh sông Hồng mênh mang sóng nước"));

        tacPhamAdapter = new TacPhamAdapter(TacPhamActivity.this, list);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle bundle = getIntent().getExtras();
        if(bundle == null){
            return;
        }
        TacGia tacGia = (TacGia) bundle.get("object_author");

        back = findViewById(R.id.tv_back_detail);
        back.setOnClickListener(view->{
            startActivity(new Intent(TacPhamActivity.this, MainActivity.class));
        });
        tvName = (TextView) findViewById(R.id.tv_name_detail);
        tvInfo = findViewById(R.id.infodetail);
        imageViewAuthor = (ImageView) findViewById(R.id.imageViewAuthor);
        ListView listWork = (ListView) findViewById(R.id.list_work);
        listWork.setAdapter(tacPhamAdapter);

        tvName.setText(tacGia.getNameTacGia());
        tvInfo.setText(tacGia.getthongTin());
        imageViewAuthor.setImageResource(tacGia.getImgTacGia());
    }
}
