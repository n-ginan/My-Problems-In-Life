def validate_pin(pin):
    for num in pin:
        if not num.isdigit():
            return False
    if len(pin) == 4 or len(pin) == 6:
        return True
    else:
        return False