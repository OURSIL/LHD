package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;
import com.tedu.sp01.pojo.User;

public interface UserService {

	/**
	 * 	��ȡ�û�����
	 */
	User getUser(Integer id);
	/**
	 * 	�����û�����
	 */
	void addScore(Integer id,Integer score);
}
