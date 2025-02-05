- Before adding Thread.sleep(): เห็นว่า Output ของแต่ละ Thread ดูไม่เป็นระเบียบ เนื่องจากเมื่อ Thread ใดทำเสร็จก็จะ Print Output ออกมาทันที

- After adding Thread.sleep(): เห็นว่า Output ของแต่ละ Thread ดูเป็นระเบียบขึ้น เนื่องจาก Output ในแต่ละ Thread จะรอเวลา Delay ก่อนค่อย Print Output ออกมา

- Multithreading หมายถึง การที่ Thread หลายๆ ตัวทำงานไปพร้อมๆ กัน ทำให้มีการรันไปพร้อมๆ กันด้วย จึงทำให้เกิดการทำงานแบบ Parallel ขึ้น ส่งผลให้ลำดับ Output ของ Thread เปลี่ยนแปลง
