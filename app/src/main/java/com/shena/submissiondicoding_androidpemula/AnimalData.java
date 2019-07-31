package com.shena.submissiondicoding_androidpemula;

import java.io.Serializable;
import java.util.ArrayList;

public class AnimalData implements Serializable{
    public static String[][] data = new String [][]{
            {"Komodo",
                    "Komodo merupakan spesies terbesar dari familia Varanidae, sekaligus kadal terbesar di dunia, dengan rata-rata panjang 2-3 meter dan beratnya bisa mencapai 100 kg. Komodo merupakan pemangsa puncak di habitatnya karena sejauh ini tidak diketahui adanya hewan karnivora besar lain selain biawak ini di sebarang geografisnya",
                    "https://upload.wikimedia.org/wikipedia/commons/5/50/Varanus_komodoensis1.jpg",
                    "false"
            },
            {"Kerbau Anoa",
                    "Anoa merupakan hewan yang tergolong fauna peralihan. Anoa merupakan mamalia tergolong dalam famili bovidae yang tersebar hampir di seluruh pulau Sulawesi. Kawasan Wallacea yang terdiri atas pulau Sulawesi, Maluku, Halmahera, Kepulauan Flores, dan pulaupulau kecil di Nusa Tenggara. Wilayah ini unik karena banyak memiliki flora dan fauna yang endemik dan merupakan kawasan peralihan antara benua Asia dan Australia. Salah satu kawasan yang memiliki flora dan fauna endemik Sulawesi antara lain Kawasan Poso. Anoa (Bubalus sp.) merupakan salah satu satwa endemik yang dilindungi yang menjadi ciri khas Pulau Sulawesi yang turut mendiami Kawasan Hutan Lindung Desa Sangginora Kabupaten Poso. Anoa tergolong satwa liar yang langka dan dilindungi Undang-Undang di Indonesia sejak tahun 1931 dan dipertegas dengan Undang-Undang No. 5 Tahun 1990 dan Peraturan Pemerintah No. 7 Tahun 1999.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/8b/Anoa_Bubalus_depressicornis_Surabaya_Zoo.jpg",
                    "false"
            },
            {"Badak Jawa",
                    "Badak Jawa adalah anggota famili Rhinocerotidae dan satu dari lima badak yang masih ada. Badak ini masih termasuk ke dalam genus yang sama dengan badak india dan memiliki kulit bermosaik yang menyerupai baju baja. Badak ini memiliki panjang 3,1–3,2 m dan tinggi 1,4–1,7 m. Badak ini lebih kecil daripada badak india dan lebih dekat dalam besar tubuh dengan badak hitam. Ukuran culanya biasanya lebih sedikit daripada 20 cm, lebih kecil daripada cula spesies badak lainnya.",
                    "https://upload.wikimedia.org/wikipedia/commons/c/ce/Rhinoceros_sondaicus_in_London_Zoo.jpg",
                    "false"
            },
            {"Babirusa",
                    "Babirusa adalah marga hewan dari beberapa jenis babi liar yang hanya terdapat di sekitar Sulawesi, Pulau Togian, Malenge, Sula, Buru dan pulau-pulau Maluku lainnya. Habitat babirusa banyak ditemukan di hutan hujan tropis. Hewan ini gemar melahap buah-buahan dan tumbuhan, seperti mangga, jamur dan dedaunan. Mereka hanya berburu makanan pada malam hari untuk menghindari beberapa binatang buas yang sering menyerang.",
                    "https://upload.wikimedia.org/wikipedia/commons/d/db/Babirusa0.jpg",
                    "false"
            },
            {"Maleo",
                    "Maleo adalah sejenis burung gosong berukuran sedang, dengan panjang sekitar 55cm, dan merupakan satu-satunya burung di dalam genus tunggal Macrocephalon. Yang unik dari maleo adalah, saat baru menetas anak burung maleo sudah bisa terbang. Ukuran telur burung maleo beratnya 240 gram hingga 270 gram per butirnya, ukuran rata-rata 11 cm, dan perbandingannya sekitar 5 hingga 8 kali lipat dari ukuran telur ayam. Namun saat ini mulai terancam punah karena habitat yang semakin sempit dan telur-telurnya yang diambil oleh manusia. Diperkirakan jumlahnya kurang dari 10.000 ekor saat ini.",
                    "https://upload.wikimedia.org/wikipedia/commons/7/7b/Stavenn_Maleo.jpg",
                    "false"
            },
            {"Orangutan Sumatera",
                    "Orangutan Sumatera adalah spesies orangutan terlangka. Orangutan Sumatra hidup dan endemik terhadap Sumatra, sebuah pulau yang terletak di Indonesia. Mereka lebih kecil daripada orangutan Kalimantan. Orangutan Sumatra memiliki tinggi sekitar 4.6 kaki dan berat 200 pon. Betina lebih kecil, dengan tinggi 3 kaki dan berat 100 pon.",
                    "https://upload.wikimedia.org/wikipedia/commons/7/75/Man_of_the_woods.JPG",
                    "false"
            },
            {"Cenderawasih Biru",
                    "Cendrawasih Biru adalah burung Cenderawasih yang berukuran sedang, dengan panjang sekitar 30cm, dari genus Paradisaea. Burung ini berwarna hitam dan biru, berparuh putih kebiruan, kaki abu-abu, iris mata berwarna coklat tua, di sekitar mata terdapat dua buah setengah lingkaran putih dan sayap berwarna biru terang. ",
                    "https://upload.wikimedia.org/wikipedia/commons/0/05/Paradisaea_rudolphi_by_Bowdler_Sharpe.jpg",
                    "false"
            },
            {"Monyet Hitam",
                    "adalah satwa endemik Indonesia yang hanya terdapat Pulau Sulawesi bagian utara dan beberapa pulau di sekitarnya. Yaki merupakan jenis monyet makaka terbesar yang ada di Pulau Sulawesi. Cirinya yang khas dari yaki adalah warna seluruh tubuhnya yang hitam dan memiliki rambut berbentuk jambul di atas kepalanya, serta memiliki pantat berwarna merah muda.",
                    "https://upload.wikimedia.org/wikipedia/commons/d/d4/Crested_Black_Macaque_%28Macaca_nigra%29.jpg",
                    "false"
            },
            {"Harimau Sumatera",
                    "Harimau Sumatera adalah subspesies harimau yang habitat aslinya di pulau Sumatra, dan merupakan satu dari enam subspesies harimau yang masih bertahan hidup hingga saat ini dan termasuk dalam klasifikasi satwa kritis yang terancam punah (critically endangered) dalam daftar merah spesies terancam yang dirilis Lembaga Konservasi Dunia IUCN. Populasi liar diperkirakan antara 400-500 ekor, terutama hidup di taman-taman nasional di Sumatra. Uji genetik mutakhir telah mengungkapkan tanda-tanda genetik yang unik, yang menandakan bahwa subspesies ini mungkin berkembang menjadi spesies terpisah, bila berhasil lestari.",
                    "https://upload.wikimedia.org/wikipedia/commons/e/e1/Sumatran_Tiger_Berlin_Tierpark.jpg",
                    "false"
            },
            {"Elang Jawa",
                    "Elang Jawa adalah salah satu spesies elang berukuran sedang yang endemik di Pulau Jawa. Satwa ini dianggap identik dengan lambang negara Republik Indonesia, yaitu Garuda. Dan sejak 1992, burung ini ditetapkan sebagai maskot satwa langka Indonesia.",
                    "https://upload.wikimedia.org/wikipedia/commons/d/db/Spiza_bartel_100109-0176_rag.JPG",
                    "false"
            }
    };

    public static ArrayList<Animal> getListAnimal(){
        ArrayList<Animal> animals = new ArrayList<>();
        for (String[]aData : data){
            Animal animal = new Animal();
            animal.setName(aData[0]);
            animal.setInfo(aData[1]);
            animal.setPhoto(aData[2]);
            animal.setFavorite(aData[3]);
            animals.add(animal);
        }
        return animals;
    }
}
