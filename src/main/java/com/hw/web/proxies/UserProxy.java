package com.hw.web.proxies;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hw.web.mappers.TxMapper;

@Component("manager")
public class UserProxy extends Proxy {
	@Autowired
	TxMapper txMapper;

	public String makeBirthday() {
		String birthday = "";
		int a = 1970, b = 2000;
		BiFunction<Integer, Integer, Integer> f = (t, u) -> (int) (Math.random() * (u - t)) + t;
		int year = f.apply(a, b);
		int[] maxDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int iMinMonth = 1;
		int iMaxMonth = 12;
		int iRandomMonth = (int) (Math.random() * iMaxMonth - iMinMonth + 1) + iMinMonth;
		int iRandomDay = (int) (Math.random() * (maxDays[iRandomMonth - 1] - 2) + 1);
		birthday = String.valueOf(year) + "��" + String.valueOf(iRandomMonth) + "��" + String.valueOf(iRandomDay) + "��";
		return birthday;
	}

	public String makeGender() {
		List<String> genderText = Arrays.asList("M", "F");
		Collections.shuffle(genderText);
		String gender = genderText.get(0);
		return gender;
	}

	public String makeUserid() {
		List<String> uidText = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "n", "m", "o",
				"p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"0");
		Collections.shuffle(uidText);
		return uidText.get(0) + uidText.get(1) + uidText.get(2) + uidText.get(3) + uidText.get(4) + uidText.get(5);
	}
	public String makeTelephone() {
		int a = 1111, b = 9999;
		BiFunction<Integer, Integer, Integer> f = (t, u) -> (int) (Math.random() * (u - t)) + t;
		int pre = f.apply(a, b);
		int af = f.apply(a, b);
		String tel = "010-" + String.valueOf(pre) + "-" + String.valueOf(af);
		return tel;
	}

	public String makeUsername() {
		List<String> fname = Arrays.asList("��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"Ȳ", "��", "��", "��", "��", "ȫ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "ä", "��", "õ", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "ǥ",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "Ź", "��", "��", "��", "��", "��", "��", "��",
				"��");
		List<String> name = Arrays.asList("��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "â", "ä", "õ", "ö", "��", "��", "��", "ġ", "Ž", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "ȣ", "ȫ", "ȭ", "ȯ", "ȸ", "ȿ", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "ȥ", "Ȳ", "��", "��", "��", "��", "��", "��", "��", "Ź", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "Ÿ", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��");
		Collections.shuffle(fname);
		Collections.shuffle(name);
		String fullname = fname.get(0) + name.get(0) + name.get(1);
		return fullname;
	}

}
