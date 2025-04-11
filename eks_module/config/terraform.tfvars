
aws_eks_cluster_config = {

      "demo-cluster" = {

        eks_cluster_name         = "demo-cluster1"
        eks_subnet_ids = ["subnet-06c2590f77920be60","subnet-015e84d89838a6f96","subnet-083cb09853bd23b12","subnet-099d98ccbd7a59678"]
        tags = {
             "Name" =  "demo-cluster"
         }  
      }
}

eks_node_group_config = {

  "node1" = {

        eks_cluster_name         = "demo-cluster"
        node_group_name          = "mynode"
        nodes_iam_role           = "eks-node-group-general1"
        node_subnet_ids          = [subnet-06c2590f77920be60","subnet-015e84d89838a6f96","subnet-083cb09853bd23b12","subnet-099d98ccbd7a59678"]

        tags = {
             "Name" =  "node1"
         } 
  }
}
