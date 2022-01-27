package com.example.postandstreetresponsejava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {
    private List<PostModel> postsList = new ArrayList<>();
    private Context mContext;
    private FragmentManager mFragmentManager;
    private PostModel postModel;



    public PostAdapter(Context context, FragmentManager fragmentManager) {
        mContext = context;
        mFragmentManager = fragmentManager;


    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.posts_ver_item_list, parent, false);
        return new PostAdapter.PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.bindPost(postsList.get(position));
    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }

    public void setList(List<PostModel> moviesList) {
        this.postsList = moviesList;
        notifyDataSetChanged();
    }


    public class PostViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.title_tv)
        TextView mPostTitle;

        @BindView(R.id.post_iv)
        ImageView mPostIv;
        @BindView(R.id.ver_cl)
        ConstraintLayout mVerCl;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }


        public void bindPost(PostModel postModel) {
//            mPostTitle.setText(postModel.getTitle());
            mPostTitle.setText(postModel.getName());
            Glide.with(mContext).load(R.drawable.cat).into(mPostIv);



        }
    }
}