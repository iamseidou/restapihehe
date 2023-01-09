terraform {
  required_providers {
    aws = {
      source = "hashicorp/aws"
      version = "4.49.0"
    }
    cloudflare = {
      source = "cloudflare/cloudflare"
      version = "3.31.0"
    }
    freenom = {
      source = "andreee94/freenom"
      version = "0.3.0"
    }
  }
}

provider "aws" {
  # Configuration options
}

provider "freenom" {
  # take domain
}

provider "cloudflare" {
  # Some DNS shit I think
}