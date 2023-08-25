.class public Lcom/google/android/material/datepicker/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/a;->Y1(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:I

.field public final synthetic q:Lcom/google/android/material/datepicker/a;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/a;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/a$a;->q:Lcom/google/android/material/datepicker/a;

    iput p2, p0, Lcom/google/android/material/datepicker/a$a;->p:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/datepicker/a$a;->q:Lcom/google/android/material/datepicker/a;

    invoke-static {v0}, Lcom/google/android/material/datepicker/a;->I1(Lcom/google/android/material/datepicker/a;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    iget v1, p0, Lcom/google/android/material/datepicker/a$a;->p:I

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->r1(I)V

    return-void
.end method
