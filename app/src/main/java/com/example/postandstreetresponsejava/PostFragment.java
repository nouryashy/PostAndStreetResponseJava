package com.example.postandstreetresponsejava;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import androidx.lifecycle.Observer;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostFragment extends Fragment {
    @BindView(R.id.posts_recycle_view)
    RecyclerView recyclerView;
    PostViewModel mPostViewModel;
    FragmentManager mFragmentManager;
    PostAdapter mPostAdapter;

    List<PostModel> mPostModels;

    private static final String TAG=PostFragment.class.getSimpleName();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_post, container, false);
        ButterKnife.bind(this, view);
        mFragmentManager = getFragmentManager();
//        mPostViewModel = ViewModelProviders.of(this).get(PostViewModel.class);
//
//        intRxList();
        intCallBack();
        return view;
    }

    private void intCallBack() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mPostAdapter = new PostAdapter(getContext(), mFragmentManager);
        recyclerView.setAdapter(mPostAdapter);
        RetrofitClient.getApi().getPosts().enqueue(new Callback<List<PostModel>>() {
            @Override
            public void onResponse(Call<List<PostModel>> call, Response<List<PostModel>> response) {
                if (response.isSuccessful()) {

                    List<PostModel> postList = response.body();
                    mPostAdapter.setList(postList);
                    Log.d(TAG, "onResponse: "+response);

                } else {
                }
            }


            @Override
            public void onFailure(Call<List<PostModel>> call, Throwable t) {
                Log.e(TAG, "onResponse: "+t);
            }
        });

    }


//    private void intRxList() {
//        mPostAdapter = new PostAdapter(getContext(), mFragmentManager);
//        mPostViewModel.getAllPosts().observe(getViewLifecycleOwner(), new Observer<List<PostModel>>() {
//            @Override
//            public void onChanged(List<PostModel> postModels) {
//                mPostAdapter.setList(postModels);
//            }
//        });
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//        recyclerView.setAdapter(mPostAdapter);
//
//
//
//    }


}
