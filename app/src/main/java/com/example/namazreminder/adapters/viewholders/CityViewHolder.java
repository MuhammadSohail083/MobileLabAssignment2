package com.example.namazreminder.adapters.viewholders;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.namazreminder.R;
import com.example.namazreminder.fragments.CitySelectionFragment;
import com.example.namazreminder.models.City;

/**
 * Created by akif on 11/05/16.
 */
public class CityViewHolder extends RecyclerView.ViewHolder {
    private View cityItemLayout;
    private TextView textViewName;

    private CitySelectionFragment.OnCitySelectedListener onCitySelectedListener;

    public CityViewHolder(View cityItemLayout, CitySelectionFragment.OnCitySelectedListener onCitySelectedListener) {
        super(cityItemLayout);

        this.cityItemLayout = cityItemLayout;
        this.onCitySelectedListener = onCitySelectedListener;

        textViewName = (TextView) cityItemLayout.findViewById(R.id.textView_item_city_name);
    }

    public void setFrom(final City city) {
        textViewName.setText(city.name);

        cityItemLayout.setOnClickListener(v -> onCitySelectedListener.onCitySelected(city));
    }
}
