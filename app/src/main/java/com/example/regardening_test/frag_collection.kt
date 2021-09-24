package com.example.regardening_test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.regardening_test.databinding.FragmentFragCollectionBinding

class frag_collection : Fragment() {
    //뷰 바인딩. xml에서 id 불러오기 위해 사용
    private lateinit var binding : FragmentFragCollectionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //0. 전체 금액
        var mymoney : Int = 10000
        //1. 뷰 바인딩 설정
        binding =  FragmentFragCollectionBinding.inflate(inflater, container, false)
        //2. 바인딩으로 total_money 텍스트에 접근. mymoney로 텍스트 수정
        binding.totalMoney.text = mymoney.toString()
        //3. 프래그먼트 레이아웃 뷰 반환
        return binding.root

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_collection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}