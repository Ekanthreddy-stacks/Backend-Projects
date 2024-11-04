package com.example.serviceImpl;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Entity.LoginEntity;
import com.example.request.LoginRequest;
import com.example.responseBody.ResponseHandler;
import com.example.respository.LoginRepository;
import com.example.service.LoginService;
import com.example.utils.pwdUtile;

@Service
public class LongSeviceimpl implements LoginService {

	@Autowired
	private LoginRepository loginRepository;
	
	
	
	@Override
	public ResponseEntity<Map<String, Object>> getLogin(LoginRequest request) {
		if(request != null) {
			LoginEntity entity = new LoginEntity();
			BeanUtils.copyProperties(request, entity);
			String pwd=pwdUtile.generatepwd();
			entity.setPwd(pwd);
			loginRepository.save(entity);
		}
		return ResponseHandler.response("sucess login ", true, null);
	}

}
