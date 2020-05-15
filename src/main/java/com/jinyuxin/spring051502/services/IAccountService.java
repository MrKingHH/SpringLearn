package com.jinyuxin.spring051502.services;

import com.jinyuxin.spring051502.entity.Account;

import java.util.List;

/**
 * 账户的业务层接口.
 * @auther SamuelKing
 * @date 2020/5/13 14:21
 */
public interface IAccountService {
  /**
   * 查询所有账户
   * */
  List<Account> queryAll();

  /**
   * 根据ID查询
   * @param id
   * @return
   */
  Account queryOneById(Integer id);

  /**
   * 保存账户
   * @param account
   */
  void saveAccount(Account account);

  /**
   * 更新账户
   * @param account
   */
  void updateAccount(Account account);

  /**
   * 根据ID删除账户
   * @param id
   */
  void deleteAccount(Integer id);
}
