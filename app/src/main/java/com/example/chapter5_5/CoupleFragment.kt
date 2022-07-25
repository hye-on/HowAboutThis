package com.example.chapter5_5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CoupleFragment : Fragment() {
    private var productDatas = ArrayList<Product>()
    lateinit var homeCoupleProductRv: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_couple, container, false)

        homeCoupleProductRv = view.findViewById(R.id.home_couple_product_rv)

        // 더미데이터 연결
        productDatas.apply {
            add(Product("코지테이블", "아이보리앤도트 머그잔", "8,400", R.drawable.list2_cup_img))
            add(Product("언폴드", "Copenhagen-bule 에코백", "9,800", R.drawable.list3_bag_img))
            add(Product("비비디", "드레스 퍼퓸 100ml", "8,950", R.drawable.list4_perfume_img))
            add(Product("라이프 아카이브", "라이프 아카이브 일회용 카메라", "20,120", R.drawable.list1_film_img))
        }

        val homeLuxuryRVAdapter = ProductRVAdapter(productDatas)
        homeCoupleProductRv.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.VERTICAL, false
        )
        homeCoupleProductRv.adapter = homeLuxuryRVAdapter

        return view
    }

}