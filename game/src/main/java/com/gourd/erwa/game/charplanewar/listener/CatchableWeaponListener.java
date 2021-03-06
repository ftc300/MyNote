/*
 * Written by wei.Li and released to the public domain
 * Welcome to correct discussion as explained at
 *
 * -----------------------------------------------------------------
 *
 * GitHub:  https://github.com/GourdErwa
 * CSDN  :	http://blog.csdn.net/xiaohulunb
 * WeiBo :	http://www.weibo.com/xiaohulunb  	@GourdErwa
 * Email :	gourderwa@163.com
 *
 * Personal home page: http://grouderwa.com
 */

package com.gourd.erwa.game.charplanewar.listener;

import com.gourd.erwa.game.charplanewar.entity.CatchableWeapon;

/**
 * 子弹爆炸监听
 */
public interface CatchableWeaponListener {

    void onCatchableWeaponLocationChanged(CatchableWeapon weapon);

}
