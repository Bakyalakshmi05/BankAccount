package in.bank.accounts.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Accounts {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_number")
	private int account_number;

	@Column(name = "customerId")
	private int customerId;

	@Column(name = "account_type")
	private String account_type;

	@Column(name = "branch")
	private String branch;

	@Column(name = "created_date")
	private LocalDate created_date;

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public LocalDate getCreatedDtae() {
		return created_date;
	}

	public void setCreatedDtae(LocalDate createdDtae) {
		this.created_date = createdDtae;
	}

	public int getAccounts_number() {
		return account_number;
	}

	public void setAccounts_number(int accounts_number) {
		this.account_number = accounts_number;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	@Override
	public String toString() {
		return "Accounts [account_number=" + account_number + ", customerId=" + customerId + ", account_type="
				+ account_type + ", branch=" + branch + ", created_date=" + created_date + "]";
	}

}
