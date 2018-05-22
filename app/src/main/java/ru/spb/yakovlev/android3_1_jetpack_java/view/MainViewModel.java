package ru.spb.yakovlev.android3_1_jetpack_java.view;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableArrayList;

import ru.spb.yakovlev.android3_1_jetpack_java.model.CounterModel;


public class MainViewModel extends ViewModel {

    private CounterModel counterModel = new CounterModel();
    public ObservableArrayList<Integer> counters = new ObservableArrayList<>();

    {
        counters.addAll(counterModel.counters);
    }

    public void calculate(int index) {
        counters.set(index, counterModel.calculate(index));
    }
}
