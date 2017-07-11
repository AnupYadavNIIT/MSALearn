package eurekaclient;

import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ItemInfoService {
	
	@HystrixCommand(fallbackMethod="getItemFromCache")
	public ItemInfo getItemInfo(int id)  throws Exception
	{
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		throw new Exception("dummy Exception");
		//return new ItemInfo();
		
	}
	
	public ItemInfo getItemFromCache(int id)  
	{
		
		return new ItemInfo("Item from Cache");
		
	}
	


}
