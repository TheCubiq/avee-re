.class Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder$2;
.super Ljava/lang/Object;
.source "ColorPickerDialogBuilder.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->setPositiveButton(ILcom/flask/colorpicker/builder/ColorPickerClickListener;)Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;

.field final synthetic val$onClickListener:Lcom/flask/colorpicker/builder/ColorPickerClickListener;


# direct methods
.method constructor <init>(Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;Lcom/flask/colorpicker/builder/ColorPickerClickListener;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder$2;->this$0:Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;

    iput-object p2, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder$2;->val$onClickListener:Lcom/flask/colorpicker/builder/ColorPickerClickListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 132
    iget-object p2, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder$2;->this$0:Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;

    iget-object v0, p0, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder$2;->val$onClickListener:Lcom/flask/colorpicker/builder/ColorPickerClickListener;

    invoke-static {p2, p1, v0}, Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;->access$000(Lcom/flask/colorpicker/builder/ColorPickerDialogBuilder;Landroid/content/DialogInterface;Lcom/flask/colorpicker/builder/ColorPickerClickListener;)V

    return-void
.end method
