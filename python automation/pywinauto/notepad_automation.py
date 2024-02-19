
from pywinauto import Application
import time

app = Application(backend='uia').start('Notepad.exe')#.connect('Untitled - Notepad')
# app.UntitledNotepad.print_control_identifiers()
text_editor = app.UntitledNotepad.child_window(title="Text Editor", auto_id="15", control_type="Edit").wrapper_object()
text_editor.type_keys("Hello, How u doing. What you did today that makes your day greater than yesterday",with_spaces = True)

fileMenu = app.UntitledNotepad.child_window(title="File", control_type="MenuItem").wrapper_object()
fileMenu.click_input()

# app.UntitledNotepad.print_control_identifiers()
# time.sleep(2)
# saveas = app.UntitledNotepad.child_window(title="Save As...        Ctrl+Shift+S", auto_id="4", control_type="MenuItem", top_level_only=True).wrapper_object()
# time.sleep(2)
# saveas.click_input()

close = app.UntitledNotepad.child_window(title="Close", control_type="Button").wrapper_object()
close.click_input()
app.UntitledNotepad.print_control_identifiers()
# SaveAs = app.UntitledNotepad.child_window(title="Save As", control_type="MenuItem").wrapper_object()
dontsave = app.UntitledNotepad.child_window(title="Don't Save", control_type="Button").wrapper_object()
dontsave.click_input()

# from pywinauto import Application
# from pywinauto.timings import wait_until

# # Start Notepad
# app = Application().start("notepad.exe")

# # Access the Notepad window
# main_window = app['Untitled - Notepad']

# # Type some text
# main_window.edit.type_keys("Hello, this is automated text using pywinauto!")

# # Save the file (you may need to adjust the path)
# main_window.menu_select("File->SaveAs")

# # Wait for the Save As dialog to appear
# save_dialog = app.window(title='Save As')
# wait_until(timeout=5, retry_interval=0.5, func=save_dialog.exists)

# # Set the file path and save
# save_dialog.edit.set_edit_text("C:\\path\\to\\your\\file.txt")
# save_dialog.save_button.click()

# # Close Notepad
# main_window.menu_select("File->Exit")

# # Wait for the application to close
# app.wait_not("exists")



# from pywinauto import Application, timings

# # Start Notepad
# app = Application(backend='uia').start('Notepad.exe')
# main_window = app.UntitledNotepad

# # Access the text editor and type some text
# text_editor = main_window.Edit
# text_editor.type_keys("Hello, How u doing. What you did today that makes your day greater than yesterday", with_spaces=True)

# # Access the File menu and click on Close
# file_menu = main_window.child_window(title="File", control_type="MenuItem")
# file_menu.click_input()

# close_button = main_window.child_window(title="Close", control_type="Button")
# close_button.click_input()

# # Access the Don't Save button and click on it
# dont_save_button = main_window.child_window(title="Don't Save", control_type="Button")
# dont_save_button.click_input()

# # Print control identifiers for debugging purposes
# main_window.print_control_identifiers()

# # Close the application
# app.kill()
