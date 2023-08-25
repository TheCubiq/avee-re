.class public final synthetic Lcom/daaw/uu1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/app/TimePickerDialog$OnTimeSetListener;


# instance fields
.field public final synthetic a:Lcom/daaw/dv1;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/dv1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/uu1;->a:Lcom/daaw/dv1;

    return-void
.end method


# virtual methods
.method public final onTimeSet(Landroid/widget/TimePicker;II)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/uu1;->a:Lcom/daaw/dv1;

    invoke-static {v0, p1, p2, p3}, Lcom/daaw/dv1;->i(Lcom/daaw/dv1;Landroid/widget/TimePicker;II)V

    return-void
.end method
