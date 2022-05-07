package com.betrybe.acc.java.bankaccount;


import org.apache.commons.lang3.StringUtils;

/**
 * AccountNumberFormatter.
 */
public class AccountNumberFormatter {
  private static final int DEFAULT_SIZE_ACCOUNT_NUMBER = 6;

  /**
   * Formata o número da conta.
   *
   * @param literalAccountNumber número da conta
   */
  public String formatAccountNumber(int literalAccountNumber) {
    String str = "" + literalAccountNumber;
    if (str.length() == DEFAULT_SIZE_ACCOUNT_NUMBER) {
      return str;
    }
    if (str.length() < DEFAULT_SIZE_ACCOUNT_NUMBER) {
      return StringUtils.leftPad(str, DEFAULT_SIZE_ACCOUNT_NUMBER, '0');
    } else {
      return StringUtils.right(str, DEFAULT_SIZE_ACCOUNT_NUMBER);
    }
  }

}
