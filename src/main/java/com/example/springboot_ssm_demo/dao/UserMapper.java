/**
 * FileName: UserMapper
 * Author:   57347
 * Date:     2020/8/10 15:37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 邵尉                8/10           1.0                测试
 */
package com.example.springboot_ssm_demo.dao;

import com.example.springboot_ssm_demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 〈接口〉<br>
 * 〈〉
 *
 * @author 57347
 * @create 2020/8/10
 * @since 1.0.0
 */
@Mapper //声明mapper，交给spring管理，不用写映射文件，mapper接口自动根据一个添加@Mapper注解的接口生成一个实现类
@Repository //标注数据访问组件，即DAO组件
public interface UserMapper {
    User selectUserByName(String name);
}
