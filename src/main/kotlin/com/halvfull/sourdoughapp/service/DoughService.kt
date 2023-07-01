package com.halvfull.sourdoughapp.service
import com.halvfull.sourdoughapp.model.Dough
import com.halvfull.sourdoughapp.repository.DoughRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DoughService(private val doughRepository: DoughRepository) {

    fun save(dough: Dough): Dough {
        return doughRepository.save(dough)
    }

}

