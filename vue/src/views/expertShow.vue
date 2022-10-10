<template>
  <div style="margin-left: 20px">
<!--    搜索表单-->
    <div style="margin-top: 20px">
      <el-input style="width: 150px" placeholder="请输入名称"></el-input>
      <el-input style="width: 150px;margin-left: 5px" placeholder="请输入标签"></el-input>
      <el-button style="margin-left: 5px" type="primary" class="el-icon-search">搜索</el-button>
    </div>

    <el-table :data="tableData" stripe highlight-current-row style="margin-top: 10px">
      <el-table-column prop="name" label="名称"></el-table-column>
      <el-table-column prop="age" label="年龄"></el-table-column>
      <el-table-column prop="label" label="标签"></el-table-column>
    </el-table>
<!--分页-->
    <div>
      <el-pagination
          style="margin-top: 20px"
          background
          layout="prev, pager, next"
          :page-size="20"
          :total="tableData.length">
      </el-pagination>
    </div>
  </div>
</template>

<script>


export default {
  name: 'expertShow',
  data() {
    return{
      tableData:[]
    }
  },
  created() {
  },
  methods:{
    load() {
      // TODO 请求后台数据
    }
  }
}
</script>