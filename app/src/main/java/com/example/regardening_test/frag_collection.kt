package com.example.regardening_test

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.regardening_test.databinding.FragmentFragCollectionBinding

class frag_collection : Fragment() {
    //뷰 바인딩. xml에서 id 불러오기 위해 사용
    private lateinit var binding : FragmentFragCollectionBinding
    lateinit var color_flower_giraffe : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_collection, container, false)

        //선택하면 팝업창
        color_flower_giraffe.setOnClickListener {
            //Dialog 만들기
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.fragment_frag_collection ,null)
            val mBuilder = AlertDialog.Builder(this)
                .setView(mDialogView)
                .setTitle("꽃기린")

            val mAlertDialog = mBuilder.show() //Dialog 보여주기

            //획득버튼
            val okButton = mDialogView.findViewById<Button>(R.id.successButton)
            okButton.setOnClickListener{
                // if (binding_mission.checkBox1.isChecked && binding_mission.checkBox2.isChecked
                //     && binding_mission.checkBox3.isChecked &&binding_mission.checkBox4.isChecked) {
                //     Toast.makeText(this, "획득", Toast.LENGTH_SHORT).show()
                // } else {
                Toast.makeText(this, "획득", Toast.LENGTH_SHORT).show()
                // }
            }

            //닫기버튼
            val noButton = mDialogView.findViewById<Button>(R.id.closeButton)
            noButton.setOnClickListener {
                mAlertDialog.dismiss()
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}