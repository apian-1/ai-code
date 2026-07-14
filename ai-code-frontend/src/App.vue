<script setup lang="ts">
import BasicLayout from '@/layouts/BasicLayout.vue'

import { index as healthCheck } from '@/api/healthController'

healthCheck().then((res) => {
  console.log(res)
})
</script>

<template>
  <BasicLayout />
</template>

<style></style>
