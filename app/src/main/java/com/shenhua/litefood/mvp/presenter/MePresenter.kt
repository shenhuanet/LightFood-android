package com.shenhua.litefood.mvp.presenter

import com.shenhua.litefood.di.component.MeModule
import com.shenhua.litefood.mvp.contract.MeContract
import javax.inject.Inject

/**
 * Created by shenhua on 2017-12-07-0007.
 * @author shenhua
 *         Email shenhuanet@126.com
 */
class MePresenter @Inject constructor(private val mModule: MeModule, private val mView: MeContract.View)
    : MeContract.Presenter, BasePresenter() {
}