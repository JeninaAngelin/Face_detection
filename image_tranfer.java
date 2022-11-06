@Override
public void onActivityResult(int requestCode, int resultCode, Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == 1)
        if (resultCode == Activity.RESULT_OK) {
            Uri selectedImage = data.getData();

            String filePath = getPath(selectedImage);
            String file_extn = filePath.substring(filePath.lastIndexOf(".") + 1);
            image_name_tv.setText(filePath);

            try {
                if (file_extn.equals("img") || file_extn.equals("jpg") || file_extn.equals("jpeg") || file_extn.equals("gif") || file_extn.equals("png")) {
                    //FINE
                } else {
                    //NOT IN REQUIRED FORMAT
                }
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
}

public String getPath(Uri uri) {
    String[] projection = {MediaColumns.DATA};
    Cursor cursor = managedQuery(uri, projection, null, null, null);
    column_index = cursor
            .getColumnIndexOrThrow(MediaColumns.DATA);
    cursor.moveToFirst();
    imagePath = cursor.getString(column_index);

    return cursor.getString(column_index);
}