package main

import (
	"fmt"
	"strings"
)

func main() {
	var input string
	var output string
	_, err := fmt.Scan(&input)
	if err != nil {
		panic(err)
	}
	output = strings.ReplaceAll(input, "WUB", " ")
	newString := strings.Join(strings.Fields(output), " ")
	fmt.Println(newString)
}