package cn.tedu.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="sidecar")
public interface SidecarServiceFeign {
	@RequestMapping("/")
	public String node();
}
