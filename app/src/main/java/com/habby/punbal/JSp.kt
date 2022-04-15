package com.habby.punbal

import android.content.Context
import com.habby.punbal.Constants.CAMPL1
import com.habby.punbal.Constants.DEEPL1
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.jsoup.Jsoup

class JSp (val context: Context) {
    private var jsoup: String? = "null"
    private val hawk : String? = Hawk.get(CAMPL1)
    private val hawkAppLink: String? = Hawk.get(DEEPL1)

    private var forJsoupSetNaming: String = Constants.FilterURL + Constants.subber1 + hawk
    private var forJsoupSetAppLnk: String = Constants.FilterURL + Constants.subber1 + hawkAppLink
    suspend fun getDocSecretKey(): String?{
        withContext(Dispatchers.IO){
            if(hawk!=null) {
                val doc = Jsoup.connect(forJsoupSetNaming).get()
                jsoup = doc.text().toString()
            } else {
                val doc = Jsoup.connect(forJsoupSetAppLnk).get()
                jsoup = doc.text().toString()
            }
        }
        return jsoup
    }
}