package gz.example.ktest.java.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.orhanobut.logger.Logger;

import gz.example.ktest.R;
import gz.example.ktest.java.View.BaseTitleBar;

public class BaseFrafment extends Fragment {
    private BaseTitleBar baseTitleBar;
    private View view;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Logger.d("onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Logger.d("onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Logger.d("onCreateView");
        view = inflater.inflate(R.layout.fragment_base, container, false);
        baseTitleBar = view.findViewById(R.id.title);
        baseTitleBar.setText(getActivity().getLocalClassName());
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Logger.d("onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Logger.d("onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Logger.d("onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Logger.d("onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Logger.d("onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Logger.d("onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Logger.d("onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Logger.d("onDetach");
        super.onDetach();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        Logger.d("onSaveInstanceState");
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        Logger.d("onViewStateRestored");
        super.onViewStateRestored(savedInstanceState);
    }
}
