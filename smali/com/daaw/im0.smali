.class public final synthetic Lcom/daaw/im0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:Lcom/daaw/avee/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/avee/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/im0;->a:Lcom/daaw/avee/MainActivity;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/im0;->a:Lcom/daaw/avee/MainActivity;

    invoke-static {v0, p1, p2}, Lcom/daaw/avee/MainActivity;->b0(Lcom/daaw/avee/MainActivity;Landroid/widget/CompoundButton;Z)V

    return-void
.end method
