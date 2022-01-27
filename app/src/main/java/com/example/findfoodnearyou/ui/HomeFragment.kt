package com.example.findfoodnearyou.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.findfoodnearyou.R
import com.example.findfoodnearyou.adapters.AsianRvAdapter
import com.example.findfoodnearyou.adapters.PopularRvAdapter
import com.example.findfoodnearyou.databinding.FragmentHomeBinding
import com.example.findfoodnearyou.models.Food

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var popularRvAdapter: PopularRvAdapter
    private lateinit var asianRvAdapter: AsianRvAdapter
    private lateinit var popularList:ArrayList<Food>
    private lateinit var asianFoodList:ArrayList<Food>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)

        loadData()
        popularRvAdapter = PopularRvAdapter(popularList,object :AsianRvAdapter.OnItemClickListener{
            override fun onItemClick(food: Food) {
                Toast.makeText(requireContext(), food.name, Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.itemFragment)
            }
        })

        binding.popularRv.adapter = popularRvAdapter

        asianRvAdapter = AsianRvAdapter(asianFoodList,object:AsianRvAdapter.OnItemClickListener{
            override fun onItemClick(food: Food) {
                Toast.makeText(requireContext(), food.name, Toast.LENGTH_SHORT).show()
            }
        })
        binding.asianFoodRv.adapter = asianRvAdapter


        return binding.root

    }

    private fun loadData() {
        popularList = ArrayList()
        asianFoodList = ArrayList()

        popularList.add(
            Food(
                name = "Float Cake Vietnam",
                "Banh troi are small white balls made of brown sugar, wrapped in glutinous rice flour. The name floating cakes came about from the way it is actually cooked.",
                image = R.drawable.float_cake,
                price = "6.05",
                restaurant = "Briand Restaurent",
                rating = "4.8",
                saved = "105",
                order = "375",
                free_ship = true,
                vegetarianFoods = true
            )
        )
        popularList.add(
            Food(
                name = "Chicken Drumstick",
                description = "Banh troi are small white balls made of brown sugar, wrapped in glutinous rice flour. The name floating cakes came about from the way it is actually cooked.",
                image = R.drawable.chicken_drumsticks,
                price = "12.05",
                restaurant = "Briand Restaurent",
                rating = "4.8",
                saved = "105",
                order = "375",
                free_ship = false,
                vegetarianFoods = false
            )
        )
        popularList.add(
            Food(
                name = "Grilled meatballs",
                "Banh troi are small white balls made of brown sugar, wrapped in glutinous rice flour. The name floating cakes came about from the way it is actually cooked.",
                image = R.drawable.grilled_meatballs,
                price = "30.75",
                restaurant = "Briand Restaurent",
                rating = "4.8",
                saved = "105",
                order = "375",
                free_ship = false,
                vegetarianFoods = false
            )
        )

        asianFoodList.add(
            Food(
                name = "Sushi",
                description = "Sushi is Japan's most famous culinary representative, typically made with rice and fillings which have been rolled inside a a sheet of dry seaweed. However, the term sushi is actually an umbrella term covering a wide range of subvarieties which can be made with a myriad of different ingredients and in as many forms and presentations.",
                image = R.drawable.sushi,
                price = "10.45",
                restaurant = "Briand Restaurent",
                rating = "4.8",
                saved = "105",
                order = "375",
                free_ship = true,
                vegetarianFoods = false
            )
        )
        asianFoodList.add(
            Food(
                name = "Ramen",
                description = "Ramen is a noodle soup that first appeared in Japan in 1910, when Chinese cooks combined the noodles with a salty broth. These curly noodles were of bright yellow color and more elastic than the Japanese noodles prepared at the time – the dough was kneaded with a sodium carbonate-infused mineral water called kansui.",
                image = R.drawable.ramen,
                price = "15.25",
                restaurant = "Briand Restaurent",
                rating = "4.8",
                saved = "105",
                order = "375",
                free_ship = false,
                vegetarianFoods = false
            )
        )
        asianFoodList.add(
            Food(
                name = "Cellophane Noodles",
                description = "Also known as Chinese vermicelli and glass noodles, these thin noodles are made from water and starch extracted from mung beans, yams, cassava, or potato. They are characterized by their translucent appearance and extremely mild flavor. Cellophane noodles are often used in soups and stir-fries, but can also be served cold in salads.",
                image = R.drawable.cellophane_noodles,
                price = "14.85",
                restaurant = "Briand Restaurent",
                rating = "4.8",
                saved = "105",
                order = "375",
                free_ship = false,
                vegetarianFoods = false
            )
        )
        asianFoodList.add(
            Food(
                name = "Tofu",
                description = "Tofu is a unique vegan product, similar to cheese in texture, and made out of coagulated soy milk. The process of coagulation separates the curd from the whey, which results in the formation of protein-packed soy curds which are stored in containers to retain a rectangular shape, making it readily available for further use.",
                image = R.drawable.tofu,
                price = "19.15",
                restaurant = "Briand Restaurent",
                rating = "4.8",
                saved = "105",
                order = "375",
                free_ship = false,
                vegetarianFoods = false
            )
        )
        asianFoodList.add(
            Food(
                name = "Yakiniku",
                description = "Yakiniku is a term denoting a Japanese technique (with Korean origins) of cooking bite-sized pieces of meat and vegetables on a table grill. It can also refer to a number of dishes cooked using the same technique. Yakiniku has Korean origins and was inspired by the famous Korean dishes galbi and bulgogi, although the meat in yakiniku is usually not marinated before grilling.",
                image = R.drawable.yakiniku,
                price = "20.95",
                restaurant = "Briand Restaurent",
                rating = "4.8",
                saved = "105",
                order = "375",
                free_ship = false,
                vegetarianFoods = false
            )
        )


    }

}

