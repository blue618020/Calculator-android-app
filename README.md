# 계산기 앱

📝 <b> tistory : </b> https://blue618020.tistory.com/77

### 🔍 학습 내용
- 숫자를 입력받으면, 퍼센트 계산한 결과를 텍스트뷰에 나오게 하기 (소수점도 가능하도록)

### 💻 실습
- editText에서 입력받은건 문자열이기 때문에, 숫자로 변경해줘야함

  소수점도 가능하도록 해야하니 실수 타입으로 변경하기

      Double.parseDouble(문자열); 

- 숫자를 입력을 했는지 확인하기 위해 값이 비어있는지 확인하기 

      변수.isEmpty();

- 만약( if ), 비어있다면 입력 필수라는 안내 문구를 띄워주기 

      Snackbar.make(버튼이름, "입력 필수", Snackbar.LENGTH_SHORT).show(); 

- 비어있지 않고 입력을 잘 받았다면, 퍼센트 계산하기 

      ((a*b)/100)

- 화면에 출력하기 위해 다시 문자열로 변경 후 textView에 세팅하기 


      .setText(String.valueOf(계산한 값이 들어있는 변수));

  문자열 변경은 <b> String.valueOf() </b>도 가능하지만, <b> 변수+"" </b> 로도 가능함
  
