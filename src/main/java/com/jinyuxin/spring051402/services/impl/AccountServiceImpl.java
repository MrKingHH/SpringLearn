package com.jinyuxin.spring051402.services.impl;

import com.jinyuxin.spring051402.dao.IAccountDao;
import com.jinyuxin.spring051402.entity.Account;
import com.jinyuxin.spring051402.services.IAccountService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账户的业务层实现类.
 *
 * @auther SamuelKing
 * @date 2020/5/13 14:22
 */
@NoArgsConstructor
public class AccountServiceImpl implements IAccountService {

  private IAccountDao accountDao;

  public void setAccountDao(IAccountDao accountDao) {
    this.accountDao = accountDao;
  }

  public List<Account> queryAll() {
    return accountDao.queryAll();
  }

  public Account queryOneById(Integer id) {
    return accountDao.queryOneById(id);
  }

  public void saveAccount(Account account) {
    accountDao.saveAccount(account);
  }

  public void updateAccount(Account account) {
    accountDao.updateAccount(account);
  }

  public void deleteAccount(Integer id) {
    accountDao.deleteAccount(id);
  }
}
