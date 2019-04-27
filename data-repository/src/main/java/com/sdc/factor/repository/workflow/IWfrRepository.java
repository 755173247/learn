package com.sdc.factor.repository.workflow;

import com.sdc.factor.workflow.entity.WfrStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 工作流状态DAO
 *
 * @author Sean
 * @since 2019-04-07
 */
@Repository
public interface IWfrRepository extends JpaRepository<WfrStatus, Long> {

}
